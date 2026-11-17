# GlobalPay Decision Log

## Confirmed Decisions

- GlobalPay is a banking-domain, cross-border payment processing simulator.
- The product direction is backend-first.
- The architecture is a modular monolith.
- The technology direction is Java 21, Spring Boot, and Maven.
- Payment processing uses a simulated processor. The project will not move real funds or connect to real banking networks.
- The approved MVP capabilities are:
  - REST APIs for payment initiation and tracking.
  - Payment instruction validation.
  - Payment lifecycle and status management.
  - ISO 20022 XML generation and validation.
  - Simulated interbank payment processing.
  - Database persistence and audit history.
  - Automated unit and integration tests.

These MVP capabilities are approved plans, not statements of completed implementation.

## Open Questions

- Which payment corridors will be supported?
- Which currencies will be supported?
- Which ISO 20022 message versions will be used?
- What detailed payment instruction, validation, acceptance, and processing business rules will apply?
- What user interface requirements, if any, should be supported?
