package sptech.school.atividaderedes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma")
    public double soma(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiplicacao")
    public double multiplicacao(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }
}