<<<<<<< HEAD
package com.authenavenue.Controller;

import com.authenavenue.Response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping()
    public ResponseEntity<ApiResponse>Home() {

        ApiResponse response = new ApiResponse();
        response.setMessage("Welcome to AI chatbot");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
=======
package com.authenavenue.Controller;

import com.authenavenue.Response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping()
    public ResponseEntity<ApiResponse>Home() {

        ApiResponse response = new ApiResponse();
        response.setMessage("Welcome to AI chatbot");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
