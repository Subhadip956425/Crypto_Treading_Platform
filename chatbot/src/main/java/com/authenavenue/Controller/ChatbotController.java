<<<<<<< HEAD
package com.authenavenue.Controller;

import com.authenavenue.DTO.PromptBody;
import com.authenavenue.Response.ApiResponse;
import com.authenavenue.Service.ChatbotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/ai/chat")
public class ChatbotController {

    private final ChatbotService chatbotService;

    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> getCoinDetails(@RequestBody PromptBody prompt) throws Exception {

        ApiResponse response = chatbotService.getCoinDetails(prompt.getPrompt());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/simple")
    public ResponseEntity<String> simpleChatHandler(@RequestBody PromptBody prompt) throws Exception {

        String response = chatbotService.simpleChat(prompt.getPrompt());

//        ApiResponse response = new ApiResponse();
//        response.setMessage(prompt.getPrompt());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
=======
package com.authenavenue.Controller;

import com.authenavenue.DTO.PromptBody;
import com.authenavenue.Response.ApiResponse;
import com.authenavenue.Service.ChatbotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/ai/chat")
public class ChatbotController {

    private final ChatbotService chatbotService;

    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> getCoinDetails(@RequestBody PromptBody prompt) throws Exception {

        ApiResponse response = chatbotService.getCoinDetails(prompt.getPrompt());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/simple")
    public ResponseEntity<String> simpleChatHandler(@RequestBody PromptBody prompt) throws Exception {

        String response = chatbotService.simpleChat(prompt.getPrompt());

//        ApiResponse response = new ApiResponse();
//        response.setMessage(prompt.getPrompt());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
>>>>>>> 11db2161694382d9c1ed547796c2660a2df2fdec
