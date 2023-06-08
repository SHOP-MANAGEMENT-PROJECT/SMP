package com.smp.utility;

import org.springframework.stereotype.Service;

@Service
public class JwtTokenManager {
//    @Value("${jwt.secretkey}")
//    String secretKey;
//    @Value("${jwt.issuer}")
//    String issuer;
//    @Value("${jwt.audience}")
//    String audience;
//
//    public Optional<String> createToken(Long id) {
//        String token = null;
//        Date date = new Date(System.currentTimeMillis() + (1000 * 60 * 5));
//        try {
//            token = JWT.create().withAudience(audience)
//                    .withIssuer(issuer) //jwtnin sahibi
//                    .withIssuedAt(new Date()) // token oluşturulma tarihi
//                    .withExpiresAt(date)
//                    .withClaim("id", id)
//                    .sign(Algorithm.HMAC512(secretKey));
//            return Optional.of(token);
//        } catch (Exception exception) {
//            return Optional.empty();
//        }
//    }
//
//
//    public Boolean validateToken(String token) {
//        try {
//            Algorithm algorithm = Algorithm.HMAC512(secretKey);
//            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).withAudience(audience).build();
//            DecodedJWT decodedJWT = verifier.verify(token);
//            if (decodedJWT == null) {
//                return false;
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new EmployeeServiceException(ErrorType.INVALID_TOKEN);
//        }
//        return true;
//    }
//
//    public Optional<Long> getIdFromToken(String token) {
//        try {
//            Algorithm algorithm = Algorithm.HMAC512(secretKey);
//            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).withAudience(audience).build();
//            DecodedJWT decodedJWT = verifier.verify(token);
//            if (decodedJWT == null) {
//                throw new EmployeeServiceException(ErrorType.INVALID_TOKEN);
//            }
//            Long id = decodedJWT.getClaim("id").asLong();
//            return Optional.of(id);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new EmployeeServiceException(ErrorType.INVALID_TOKEN);
//        }
//    }
//    public Optional<String> getRoleFromToken(String token) {
//        try {
//            Algorithm algorithm = Algorithm.HMAC512(secretKey);
//            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).withAudience(audience).build();
//            DecodedJWT decodedJWT = verifier.verify(token);
//            if (decodedJWT == null) {
//                throw new EmployeeServiceException(ErrorType.INVALID_TOKEN);
//            }
//            String role = decodedJWT.getClaim("role").asString();
//            return Optional.of(role);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new EmployeeServiceException(ErrorType.INVALID_TOKEN);
//        }
//    }
}

