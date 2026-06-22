# ADR-002: Kafka Event Driven Architecture

## Status

Approved

## Context

Ride booking, payments, notifications, and analytics require asynchronous communication.

---

## Decision

Use Apache Kafka as the enterprise event backbone.

Topics:

- ride-created
- driver-assigned
- payment-completed
- notification-sent

---

## Alternatives

RabbitMQ

Pros:
- Simpler

Cons:
- Less suitable for large-scale event streaming

---

## Risk Assessment

Medium

---

## Approved By

Chief Architect