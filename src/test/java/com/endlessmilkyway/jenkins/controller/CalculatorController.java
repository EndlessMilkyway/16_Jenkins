package com.endlessmilkyway.jenkins.controller;

import com.endlessmilkyway.jenkins.dto.CalculatorDTO;
import com.endlessmilkyway.jenkins.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Slf4j
@Controller
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /* Application 상태 확인용 health check용 메서드 */
    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "it's ok";
    }

    @GetMapping("/plus")
    public ResponseEntity<CalculatorDTO> plusTowNumbers(CalculatorDTO calculatorDTO) {

//        log.info("plus 핸들러에 전달되는 값 확인 : {}", calculatorDTO);

        int result = calculatorService.plusTwoNumbers(calculatorDTO);

        calculatorDTO.setSum(result);

        return ResponseEntity.ok().body(calculatorDTO);
    }
}
