package com.company.project.model;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.persistence.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;

@Table(name = "decode_test")
public class DecodeTest {
    @Id
    private Integer testid;

    private Short status;

    private static final String KEY_ALGORITHM = "DES";

    private static final String CIPHER_ALGORITHM = "DES/ECB/PKCS5Padding";

    /**
     * @return testid
     */
    public Integer getTestid() {
        return testid;
    }

    /**
     * @param testid
     */
    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    /**
     * @return status
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Short status,String name) {
        String keyStr = name;
        String inputStr = "";
        try {





        } catch ( Exception e) {
            e.printStackTrace();
            return;
        }

        this.status = status;
    }
}