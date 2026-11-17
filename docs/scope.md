# GlobalPay Scope

## Product Scope

GlobalPay is a banking-domain, cross-border payment processing simulator. It is intended to demonstrate modern payment processing concepts, ISO 20022 messaging, and the end-to-end payment lifecycle, using a simulated processor without moving real funds.

## MVP In Scope

The following capabilities are approved for the MVP. They are planned features and are not claims of completed implementation:

- REST APIs for payment initiation and tracking.
- Payment instruction validation.
- Payment lifecycle and status management.
- ISO 20022 XML generation and validation.
- Simulated interbank payment processing.
- Database persistence and audit history.
- Automated unit and integration tests.

## Out of Scope

- Real SWIFT connectivity.
- Integrations with real banking networks.
- Actual movement of funds.

## Technical Boundaries

- **Language:** Java 21
- **Framework:** Spring Boot
- **Build tool:** Maven
- **Architecture:** Modular monolith

These are the confirmed technical direction; detailed implementation choices remain open unless specified elsewhere in approved project documentation.

## Open Questions

- Which payment corridors will be supported?
- Which currencies will be supported?
- Which ISO 20022 message versions will be used?
- What detailed payment instruction, validation, acceptance, and processing business rules will apply?
- What user interface requirements, if any, should be supported?
