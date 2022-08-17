package com.example.demo.bathroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "bathrooms")
@CrossOrigin(origins = "http://localhost:19006")
public class BathroomController {

    private final BathroomService bathroomService;

    @Autowired
    public BathroomController(BathroomService bathroomService) {this.bathroomService = bathroomService;}

    @GetMapping
    public List<Bathroom> getBathrooms(){
        return bathroomService.getBathrooms();
    }

    @PostMapping
    public Bathroom registerNewBathroom(@RequestBody Bathroom bathroom) {
        return bathroomService.addNewBathroom(bathroom);
    }

    @DeleteMapping(path = "{bathroomId}")
    public void deleteBathroom(@PathVariable("bathroomId") Long bathroomId) {
        bathroomService.deleteBathroom(bathroomId);
    }

//    @PutMapping(path = "{bathroomId}")
//    public void updateBathroom(
//            @PathVariable ("bathroomId") Long bathroomId,
//            @RequestParam(required = false) String address,
//            @RequestParam(required = false) String description) {
//         bathroomService.updateBathroom(bathroomId,address, description);
//    }

    @PutMapping(path = "{bathroomId}")
    public Bathroom updateBathroom(
            @PathVariable ("bathroomId") Long bathroomId,
            @RequestBody Bathroom bathroom) {
        return bathroomService.updateBathroom(bathroomId, bathroom);
    }

}
