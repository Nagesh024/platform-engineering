package com.rapido.platformengineering.audit;

import com.rapido.platformengineering.entity.AuditEvent;
import com.rapido.platformengineering.repository.AuditEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuditService {

    private final AuditEventRepository repository = null;

    public void save(
            String type,
            String actor,
            String action
    ) {

        AuditEvent event = AuditEvent.builder()
                .eventType(type)
                .actor(actor)
                .action(action)
                .createdAt(LocalDateTime.now())
                .build();

        repository.save(event);
    }
}