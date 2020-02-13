package guru.springframework.beerservice.controller;

import guru.springframework.beerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId)
    {
        //to do impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity saveNewBeer(@PathVariable("beerDto") BeerDto beerDto)
    {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity upsdateBeerById(@PathVariable("BeerId") UUID uid)
    {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }




}
