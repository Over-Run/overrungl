# Contributing Guidelines

Thank you for your interest in contributing to our project!
We welcome all forms of contributions—whether it's reporting bugs, suggesting features, improving documentation,
or submitting code.

## Issues

We use Issues to track bugs and feature requests. Please make sure to:

- Use the provided issue templates when creating a new issue.
- Search existing issues before submitting a new one to avoid duplicates.
- Provide clear descriptions, steps to reproduce (for bugs), and context (for feature requests).

For general questions, discussions, or support,
please use [discussions](https://github.com/Over-Run/overrungl/discussions).

## Pull Requests

We gladly accept pull requests! To ensure a smooth review process:

- Make sure your code follows our style guidelines (see below).
- Add or update tests as necessary.
- Update documentation if you change behavior or add new features.
- Reference related issues in your PR description.

PRs will be reviewed as soon as possible. We appreciate your patience.

### Code Style

To maintain consistency across the codebase, please adhere to the following:

#### License Header

All Java source files **should** include the MIT license header:

```java
/*
 * MIT License
 *
 * Copyright (c) <YEAR> Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
```

Replace <YEAR> with the year the file was created (if applicable) and the current year,
connected by a hyphen to form a range (e.g., 2022-2025).

#### Naming Conventions

- Class names: Use `PascalCase`
- Method and field names: Use `camelCase`
- Constants: Use `UPPER_SNAKE_CASE`

#### Formatting

We use an [.editorconfig](.editorconfig) file to maintain consistent coding styles.
Please ensure your editor supports it or follows the rules manually.

#### Generated Code

Exceptions to these rules may be made for automatically generated source files.

## Discussions

We encourage everyone to participate in [Discussions](https://github.com/Over-Run/overrungl/discussions). This is a great place to:

- Ask questions
- Share ideas or use cases
- Propose changes before writing code
- Show off projects built with this library

## Commit Messages

Write clear and concise commit messages **in English**.
Use the imperative mood (e.g., "Add feature" not "Added feature").
Reference issues where applicable.

## Security

If you discover a security vulnerability, please do not open a public issue.
Instead, refer to our [Security Policy](SECURITY.md) for reporting instructions.
