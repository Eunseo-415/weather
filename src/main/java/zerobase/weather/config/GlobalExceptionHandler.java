package zerobase.weather.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import zerobase.weather.WeatherApplication;


@RestControllerAdvice   //전역 예외 처리
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(WeatherApplication.class);

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)  //컨트롤러 안에 있는 예외 처리
    public Exception handleAllException(){
        logger.error("error from global exception");
        return new Exception();
    }
}
