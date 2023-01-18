package com.alperenikinci.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.lang.reflect.Field;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    INTERNAL_ERROR(5100,"Sunucuda beklenmeyen bir hata oluştu", HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(4100,"Parametre eksik veya hatalı",HttpStatus.BAD_REQUEST),
    LOGIN_ERROR(4110,"Kullanıcı adı veya şifre hatalı", HttpStatus.BAD_REQUEST),
    REGISTER_REPASSWORD_ERROR(4112,"Girilen şifreler uyuşmuyor.", HttpStatus.BAD_REQUEST),
    REGISTER_KULLANICIADI_KAYITLI(4112,"Kullanıcı adı zaten kayıtlı", HttpStatus.BAD_REQUEST);
    int code;
    String message;

    HttpStatus httpStatus;

}
