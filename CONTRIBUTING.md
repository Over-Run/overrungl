# Contributing Guidelines

You are welcome to contribute to OverrunGL.

## Code of Conduct

You must respect the [Code of Conduct](CODE_OF_CONDUCT.md).

## Issues

To start with [issues](https://github.com/Over-Run/overrungl/issues), we recommend you to use the issue template.

## Pull Requests

The pull requests will be reviewed in 1-5 workweeks. Please note that the code must be formatted.

### Formatted Code

The formatted code:

- Except auto-generated files, Java files header **MUST** contain the copy [LICENSE](LICENSE). The copy **MUST** be ended without empty line and commented with block style;
- The class names **MUST** be CamelCase;
- The method and field names _should_ be camelCase;
- The file encoding **MUST** be UTF-8;
- The file line separator **MUST** be LF;
- Other rules specified by [.editorconfig](.editorconfig).

Example:

```java
/**
 * The copy of license
 */

/**
 * Example
 *
 * @author Example
 * @since Example
 */
public class Example /* Space */ {
    public static void main(String[] /* Space */ args) /* Space */ {
        if (a) /* Space no new line */ {
            System.out.println("Example a");
        } /* Space no new line */ else if (b) /* Space no new line */ {
            System.out.println("Example b");
        } /* Space no new line */ else /* Space no new line */ {
            System.out.println("Example c");
        }
    }
}
```

## Discussions

You can visit our [forum](https://github.com/Over-Run/overrungl/discussions) and create your post, share your experience
or just ask some questions.
