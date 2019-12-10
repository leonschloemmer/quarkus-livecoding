package at.htl.control;

import com.fasterxml.jackson.databind.node.BigIntegerNode;

import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

public class PasswordSecurityUtils {

    private PasswordSecurityUtils() {}

//    public static boolean validatePassword(String submittedPassword, String storedPassword)
//            throws NoSuchAlgorithmException, InvalidKeySpecException {
//        String[] parts = storedPassword.split(":");
//        int iterations = Integer.parseInt(parts[0]);
//        byte[] salt = fromHex(parts[1]);
//        byte[] hash = fromHex(parts[2]);
//
//        PBEKeySpec spec = new PBEKeySpec(submittedPassword.toCharArray(), salt, iterations, hash.length * 8);
//        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
//        byte[] testHash = skf.generateSecret(spec).getEncoded();
//
//        int diff = hash.length ^ testHash.length;
//        for (int i = 0; i < hash.length && i < testHash.length; i++) {
//            diff |= hash[i] ^ testHash[i];
//        }
//        return diff == 0;
//    }

}
