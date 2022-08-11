package com.example.demo.bathroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BathroomService {

    private final BathroomRepository bathroomRepository;

    @Autowired
    public BathroomService(BathroomRepository bathroomRepository){
        this.bathroomRepository = bathroomRepository;
    }


    public List<Bathroom> getBathrooms() {
        return bathroomRepository.findAll();
    }

    public void addNewBathroom(Bathroom bathroom) {
        bathroomRepository.save(bathroom);
    }

    public void deleteBathroom(Long bathroomId) {
        boolean exists = bathroomRepository.existsById(bathroomId);
        if (!exists) {
            throw new IllegalStateException(
                    "student with id " + bathroomId + " does not exists");

        }
        bathroomRepository.deleteById(bathroomId);
    }

    public void updateBathroom(Long bathroomId,
                               String address,
                               String description){
        Bathroom bathroom = bathroomRepository.findById(bathroomId)
                .orElseThrow(() -> new IllegalStateException(
                        "bathroom with id " + bathroomId + " does not exist"
        ));

        if (address != null &&
            address.length() > 0 &&
        !Objects.equals(bathroom.getAddress(), address)) {
            bathroom.setAddress(address);
        }

        if (description != null &&
            description.length() > 0 &&
        !Objects.equals(bathroom.getDescription(), description)) {
            bathroom.setDescription(description);
        }
    }
}
