package com.example.demo.service;

import com.example.demo.entity.RandNumMessage;
import com.example.demo.repository.RandNumRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RandNumService {
    // 저장소
    private RandNumRepository repository;

    public RandNumService(RandNumRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public RandNumMessage getRandom() {
        return repository.getRandom();
    }
}