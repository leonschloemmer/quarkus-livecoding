package at.htl.control;

import org.eclipse.microprofile.jwt.Claims;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.NumericDate;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.util.Map;
import java.util.stream.Collectors;

import static io.smallrye.jwt.KeyUtils.decodePrivateKey;
//import static io.smallrye.jwt.KeyUtils.readPrivateKey;

public class TokenUtils {

    private TokenUtils() {

    }

}
