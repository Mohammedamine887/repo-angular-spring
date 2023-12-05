package com.project.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.project.backend.service.ReservationService;

@RestController
public class ReservationController {
    @Autowired
    ReservationService R;
}
