package com.restfullapi.jwt.models;

import lombok.Data;

@Data

public class userPrincipal {
    private static String username;

    public static String getUsername() {
        return username;
    }

}
