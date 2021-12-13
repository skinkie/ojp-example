package com.bliksemlabs;

import de.vdv.ojp.*;
import de.vdv.ojp.ObjectFactory;
import de.vdv.ojp.model.*;
import jakarta.xml.bind.*;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class Main {
    private static ObjectFactory ojpObjectFactory = new ObjectFactory();

    private static Unmarshaller getOJPUnmarchaller() {
        Unmarshaller jaxbUnmarshaller = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return jaxbUnmarshaller;
    }

    public static void exportOutputStream(OJP ojp, OutputStream outputStream) throws Exception {
            JAXBContext jaxbContext1 = JAXBContext.newInstance(OJP.class);
            Marshaller marshaller = jaxbContext1.createMarshaller();
            DOMResult domResult = new DOMResult();
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new NameSpaceMapper());
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            marshaller.marshal(ojp, domResult);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(new DOMSource(domResult.getNode()), new StreamResult(outputStream));
    }

    public static XMLGregorianCalendar getXMLGregorianCalendarNow() throws Exception {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now =
                datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
        return now;
    }

    public static void main(String[] args) throws Exception {
        ZonedDateTime now = ZonedDateTime.now();
        OJP ojp = new OJP()
                .withOJPRequest(new OJPRequestStructure()
                        .withServiceRequest(new ServiceRequest()
                                .withRequestTimestamp(now)
                                .withRequestorRef(new ParticipantRefStructure().withValue("API-Explorer"))
                                .withAbstractFunctionalServiceRequest(ojpObjectFactory.createOJPStopEventRequest(new OJPStopEventRequestStructure()
                                        .withRequestTimestamp(now)
                                        .withLocation(new PlaceContextStructure().withPlaceRef(new PlaceRefStructure()
                                                .withStopPlaceRef(new StopPlaceRefStructure().withValue("8507000"))
                                                .withLocationName(new InternationalTextStructure().withText(new NaturalLanguageStringStructure().withValue("Bern")))
                                        ))
                                        .withParams(new StopEventParamStructure()
                                                .withNumberOfResults(BigInteger.valueOf(1))
                                                .withStopEventType(StopEventTypeEnumeration.DEPARTURE)
                                                .withIncludeRealtimeData(true)
                                        )
                                ))
                        ));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        exportOutputStream(ojp, outputStream);

        String asString = outputStream.toString();
        System.out.println(asString);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(asString.getBytes());
        Unmarshaller ojpUnmarshaller = getOJPUnmarchaller();
        OJP parsed = (OJP) ojpUnmarshaller.unmarshal(inputStream);

        System.out.println(parsed.getOJPRequest().getServiceRequest().getRequestorRef());
    }
}
