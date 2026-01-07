package com.eazybytes.accounts.exception;

import com.eazybytes.accounts.dto.errorResponseDTO;
import org.jspecify.annotations.Nullable;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    //exception if trying to create a duplicate customer
    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<errorResponseDTO> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException exception, WebRequest req)
    {
        errorResponseDTO error=new errorResponseDTO(
                req.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    //exception if trying to search for customer which doesn't exist
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<errorResponseDTO> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest req)
    {
        errorResponseDTO error=new errorResponseDTO(
                req.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //general runtime exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<errorResponseDTO> genericRuntimeException(Exception exception, WebRequest req)
    {
        //creating a response dto object including all imp fields
        errorResponseDTO error = new errorResponseDTO(
                req.getDescription(false),
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //to validate arguments data sent while calling controller methods
    //overriding an existing method from "ResponseEntityExceptionHandler" class, that handle exceptions invalid method arguments
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        //map to store error field name and error message
        HashMap<String, String> errorMap = new HashMap<>();

        //list to get all error from ex argument
        List<ObjectError> errorList = ex.getBindingResult().getAllErrors();

        //now store all errors from list to hashmap, by dividing them individually
        errorList.forEach(error -> {
            errorMap.put(((FieldError)error).getField(), error.getDefaultMessage());
        });

        return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
    }
}
