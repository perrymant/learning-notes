### Refactoring Tips
command-option + m: If you spot `Single Responsibility Principle`
command-option + n: if only used once, and not going to make the line too long.
command-option + c: for `magic literals`. Variables should only have to be changed in one location

- Main classes should be ±1 line. There is not much need to test it.
- Avoid OR/AND in a method/class names.
- Only 1 public class per file.
- Paste class code when in the "Project pane" -> auto generate class.
- POJOs get tested through their use in other classes.
- MVP minimum viable product.
- Default considerations: seed data, testing, documentation.

Limit the consequences of change to create a more maintainable design.

Once requirements are met, create a new branch to work on the future requirements, this could be a branch off master.
Refactoring, make sure that any incomprehensible code becomes comprehensible by extracting a method with a sensible, descriptive name.
Code blocks in for/if statements can be made to be one line long - just the name of a method that describes what is going on.

### Try to make code compile!
- Delete redundant tests
- Commit after refactor
- Leave the latest push in a green state
- Make sure each sprint has it's requirements.
- Priority: get a clean master
- Approve PR before merging
- Re-add reviewers after addressing review comments
- who should merge? owner of PR or approver? when would you choose one over the other? TODO: HW!
- flesh out requirements again
- design should be solid before implementing

// "/".equals(stringRep.substring(1))  --> null safe-er (... not super null safe though...)
