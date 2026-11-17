# GlobalPay

GlobalPay is a banking-domain, cross-border payment processing platform designed as a hands-on implementation of modern payment processing concepts and ISO 20022 messaging standards. It simulates the end-to-end payment lifecycle, from instruction intake and validation through processing, message generation, status reporting, and tracking.

The project follows a **modular monolith** architecture using **Java 21**, **Spring Boot**, and **Maven**. Payment processing is simulated: GlobalPay does not connect to real banking networks or move actual funds.

## MVP Capabilities

These are approved MVP capabilities and are planned, not yet implemented:

- REST APIs for payment initiation and tracking.
- Payment instruction validation.
- Payment lifecycle and status management.
- ISO 20022 XML generation and validation.
- Simulated interbank payment processing.
- Database persistence and audit history.
- Automated unit and integration tests.

## Project Documentation

- [Project overview](docs/project-overview.md)
- [Scope](docs/scope.md)
- [Architecture](docs/architecture.md)
- [Payment flow](docs/payment-flow.md)
- [Decision log](docs/decision-log.md)
