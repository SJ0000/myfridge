package com.seb39.myfridge.controller;

import com.seb39.myfridge.domain.auth.annotation.AuthMemberId;
import com.seb39.myfridge.domain.fridge.dto.FridgeDto;
import com.seb39.myfridge.domain.fridge.entity.Fridge;
import com.seb39.myfridge.domain.fridge.entity.FridgeIngredient;
import com.seb39.myfridge.domain.fridge.mapper.FridgeMapper;
import com.seb39.myfridge.domain.fridge.service.FridgeIngredientService;
import com.seb39.myfridge.domain.fridge.service.FridgeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/fridge")
@RequiredArgsConstructor
public class FridgeController {

    private final FridgeService fridgeService;

    private final FridgeMapper fridgeMapper;

    private final FridgeIngredientService fridgeIngredientService;

    @PostMapping
    public ResponseEntity<FridgeDto.Response> postFridgeIngredient(@Valid @RequestBody FridgeDto.Post requestBody,
                                                                   @AuthMemberId Long memberId) {
        Fridge fridge = fridgeService.findFridge(memberId);
        List<FridgeIngredient> fridgeIngredients = fridgeIngredientService.createFridgeIngredient(fridge, requestBody);
        FridgeDto.Response response = fridgeMapper.fridgeIngredientsToResponse(fridgeIngredients);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<FridgeDto.Response> getFridgeIngredient(@AuthMemberId Long memberId) {
        Fridge fridge = fridgeService.findFridge(memberId);
        List<FridgeIngredient> fridgeIngredient = fridgeIngredientService.findFridgeIngredient(fridge.getId());
        FridgeDto.Response response = fridgeMapper.fridgeIngredientsToResponse(fridgeIngredient);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteFridgeIngredient(@AuthMemberId Long memberId) {
        Fridge fridge = fridgeService.findFridge(memberId);
        fridgeIngredientService.deleteFridgeIngredient(fridge.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
