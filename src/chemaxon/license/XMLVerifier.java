package chemaxon.license;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class XMLVerifier {

    public XMLVerifier()
            throws NoSuchAlgorithmException {
    }

    public ArrayList verifyXML(InputStream paramInputStream)
            throws Exception {
        return verifyXML(paramInputStream, null);
    }

    public ArrayList<License> verifyXML(InputStream paramInputStream, Logger paramLogger)
            throws ParserConfigurationException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, IOException, SAXException, LicenseProcessingException {
        XMLReader localXMLReader = new XMLReader();
//        paramLogger.warning("This is a hacked version");
        return localXMLReader.readXML(paramInputStream);
    }
}