# GlobalPay Architecture

## Confirmed Architecture Decisions

- **Application direction:** Backend-first.
- **Architecture style:** Modular monolith.
- **Language:** Java 21.
- **Framework:** Spring Boot.
- **Build tool:** Maven.
- **Payment processing:** A simulated payment processor.
- **External boundaries:** GlobalPay will not connect to real banking networks or move real funds.

## What a Modular Monolith Means for GlobalPay

GlobalPay will be built as one backend application, with its code organized into modules. This keeps the application together while providing a structure for its payment processing responsibilities. The detailed module boundaries have not yet been decided.

## Open Questions

- What should the detailed module boundaries and responsibilities be?
- What database and persistence design should be used?
- What API design should be used?
- Which additional libraries, tools, or technical choices are needed?
