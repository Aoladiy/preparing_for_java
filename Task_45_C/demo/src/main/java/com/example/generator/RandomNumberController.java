package com.example.generator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class RandomNumberController {

    @GetMapping("/")
    public String showForm() {
        return "number-form";
    }

    @PostMapping("/generate")
    public String generateNumbers(@RequestParam("min") int min,
                                  @RequestParam("max") int max,
                                  Model model) {
        List<Integer> numbers = generateRandomNumbers(min, max);
        double average = calculateAverage(numbers);

        model.addAttribute("numbers", numbers);
        model.addAttribute("average", average);

        return "number-result";
    }

    private List<Integer> generateRandomNumbers(int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int number = random.nextInt(max - min + 1) + min;
            numbers.add(number);
        }

        return numbers;
    }

    private double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.size();
    }
}

