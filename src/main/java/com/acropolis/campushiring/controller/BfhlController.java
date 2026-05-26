package com.acropolis.campushiring.controller;

import com.acropolis.campushiring.dto.BfhlRequest;
import com.acropolis.campushiring.dto.BfhlResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @PostMapping
    public ResponseEntity<BfhlResponse> processBfhl(@RequestBody BfhlRequest request) {
        BfhlResponse response = new BfhlResponse();
        
        response.setIs_success(true);
        response.setUser_id("ananya_sharma_17012005");
        response.setEmail("ananyasharma231341@acropolis.in");
        response.setRoll_number("0827CY231012");
        
        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();
        List<String> alphabetStrings = new ArrayList<>();
        
        int sum = 0;
        
        for (String item : request.getData()) {
            if (item == null || item.isEmpty()) {
                continue;
            }
            
            if (isNumeric(item)) {
                int num = Integer.parseInt(item);
                sum += num;
                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }
            } else if (isAlphabetic(item)) {
                alphabets.add(item.toUpperCase());
                alphabetStrings.add(item);
            } else {
                specialCharacters.add(item);
            }
        }
        
        response.setOdd_numbers(oddNumbers);
        response.setEven_numbers(evenNumbers);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(specialCharacters);
        response.setSum(String.valueOf(sum));
        response.setConcat_string(buildConcatString(alphabetStrings));
        
        return ResponseEntity.ok(response);
    }
    
    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean isAlphabetic(String str) {
        return str.matches("[a-zA-Z]+");
    }
    
    private String buildConcatString(List<String> alphabetStrings) {
        StringBuilder combined = new StringBuilder();
        for (String s : alphabetStrings) {
            combined.append(s);
        }
        
        String reversed = new StringBuilder(combined.toString()).reverse().toString();
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        
        return result.toString();
    }
}
