# GlobalPay Project Overview

## Purpose

GlobalPay is a banking-domain, cross-border payment processing platform designed as a hands-on implementation of modern payment processing concepts and ISO 20022 messaging standards.

The application simulates the end-to-end lifecycle of cross-border payments, including payment instruction intake, validation, acceptance, processing, interbank message generation, status reporting and payment tracking.

GlobalPay follows a modular monolith architecture using Java 21 and Spring Boot. It includes a simulated payment processor to demonstrate banking payment flows without connecting to real banking networks or moving actual funds.

The project aims to demonstrate practical knowledge of Java backend engineering, banking payment concepts, ISO 20022 messaging, software architecture, API development, persistence, testing and payment lifecycle management.

## Objectives

- Demonstrate an end-to-end simulated cross-border payment lifecycle.
- Apply ISO 20022 messaging concepts in the context of interbank message generation.
- Demonstrate Java backend engineering and API development with a modular monolith.
- Provide practical examples of persistence, testing, and payment lifecycle management.
- Keep payment processing simulated, without connecting to real banking networks or moving funds.

## High-Level Payment Processing Lifecycle

The approved high-level lifecycle is:

1. Intake a payment instruction.
2. Validate the instruction.
3. Accept the instruction.
4. Process the payment through the simulated processor.
5. Generate an interbank message.
6. Report status and support payment tracking.

This overview does not define detailed transitions, validation rules, or processing outcomes.

## Confirmed Technology and Architecture

- **Language:** Java 21
- **Framework:** Spring Boot
- **Architecture:** Modular monolith
- **Processor:** Simulated payment processor; no real banking network connection or movement of funds
- **Messaging direction:** ISO 20022 is part of the project direction

## MVP Scope

The following capabilities are approved for the MVP. They are planned capabilities and are not statements of completed implementation:

1. REST APIs for payment initiation and tracking.
2. Payment instruction validation.
3. Payment lifecycle and status management.
4. ISO 20022 XML generation and validation.
5. Simulated interbank payment processing.
6. Database persistence and audit history.
7. Automated unit and integration tests.

## Scope and Decisions

### Confirmed scope

- A banking-domain simulator for cross-border payment processing.
- Demonstration of the payment lifecycle described above.
- ISO 20022 messaging concepts, including interbank message generation.
- Java 21, Spring Boot, and modular monolith architecture.
- No real banking network connectivity and no actual movement of funds.

### Proposed capabilities

The approved product description identifies the following as areas the project aims to demonstrate. Their detailed behavior and implementation are not yet specified:

- APIs for payment instruction intake and status reporting.
- Persistence for payment records and tracking.
- Tests for payment processing and lifecycle management.
- ISO 20022 interbank message generation.

### Open questions

- Which payment instruction fields, validation rules, and acceptance criteria should apply?
- Which lifecycle states, transitions, processing outcomes, and status details should be supported?
- Which APIs and persistence approach should be used?
- Which ISO 20022 message types and versions should be supported?
- Are any specific payment corridors or currencies in scope?

No business rules, payment corridors, currencies, or ISO 20022 versions are defined by this overview.
