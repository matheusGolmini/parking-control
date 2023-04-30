package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ParkingSportService {
     final  ParkingSpotRepository parkingSpotRepository;

     public ParkingSportService(ParkingSpotRepository parkingSpotRepository) {
         this.parkingSpotRepository = parkingSpotRepository;
     }

     @Transactional
     public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
         return parkingSpotRepository.save(parkingSpotModel);
     }
}
