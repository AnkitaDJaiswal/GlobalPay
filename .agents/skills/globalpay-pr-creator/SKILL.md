---
name: globalpay-pr-creator
description: Create a GlobalPay story pull request from its already-pushed feature branch into develop when explicitly invoked with a story ID.
---

# GlobalPay Pull Request Creator

Create a GitHub pull request for a GlobalPay story. The user must explicitly invoke this skill and provide the story ID (for example, `GP-001`). Do not activate this workflow from an implied request or without a story ID.

## Required input

- **Story ID:** such as `GP-001`. Use it to identify the feature branch and, when available, the matching GitHub issue.

## Workflow

1. Verify that the current repository is the intended GlobalPay repository by inspecting its root and Git remote. If the repository identity is missing or ambiguous, stop and report it.
2. Verify the current branch follows `feature/<story-id>-<short-description>` and includes the supplied story ID. Do not switch branches or create branches.
3. Check the working tree with `git status --porcelain=v1 --untracked-files=all`. It must have no changes, except that this exact entry is allowed when it is untracked: `?? .agents/skills/globalpay-pr-creator/SKILL.md`. No other untracked files or directories are allowed; any staged change or tracked modification, including a staged or modified version of the skill file, requires stopping. Also verify the branch has a remote tracking branch and all local commits are pushed. Confirm the live remote feature branch points to the same commit as local `HEAD`; do not rely only on a potentially stale tracking ref. Stop if any check fails.
4. Verify the intended remote has a `develop` branch. Use that remote-tracking `develop` branch as the comparison base, and set the pull request base to the remote `develop` branch.
5. Inspect the commits and complete diff from `develop` to the feature branch. Confirm the changes belong to the supplied story. If unrelated changes are present or the story scope is unclear, stop and report the concern.
6. Search GitHub for the issue matching the story ID when possible. Use the issue title and requirements to inform the pull request. If no matching issue is available, state that in the pull request and reference the story ID without inventing an issue number.
7. Before creating a pull request, search all pull requests in the repository for one whose source branch matches the current feature branch and whose title or body references the supplied story ID. If a match exists, do not create another pull request; return the existing pull request's URL, title, and state.
8. If no matching pull request exists, create one from the feature branch into `develop` with:
   - A descriptive title that includes the story ID.
   - A concise summary of the actual changes.
   - Validation details that accurately report checks performed and their results; do not claim checks that were not run.
   - A non-closing issue reference such as `Refs #123` when an issue is found. Never use an auto-closing reference.
9. Return the pull request URL, title, source and target branches, summary, validation details, and issue reference or note that no matching issue was found.

Use available Git and GitHub tools to inspect repository state and create the pull request. If required GitHub access or permission to create a pull request is unavailable, stop and explain what is missing.

## Safety boundaries

- Never merge a pull request or close an issue.
- Never stage, commit, or push changes. The feature branch must already be pushed before this workflow can continue.
- Never modify project files or make code changes as part of creating the pull request.
- Stop and report when repository, branch, cleanliness, remote tracking, pushed-commit, story-scope, or GitHub permission prerequisites are not satisfied.
