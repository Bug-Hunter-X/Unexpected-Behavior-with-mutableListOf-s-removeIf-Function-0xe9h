# Kotlin mutableListOf removeIf Unexpected Behavior
This example demonstrates an uncommon issue with Kotlin's `mutableListOf` and its `removeIf` function. When elements are removed during the iteration, the index may be affected unexpectedly.

## The Bug
The code in `bug.kt` attempts to remove even numbers from a list.  However, the result is not what one might expect due to how `removeIf` modifies the list during iteration.

## Solution
The `bugSolution.kt` file shows a corrected approach using an iterator or creating a new list to avoid unexpected behavior.

## How to Reproduce
1. Save the code in `bug.kt`.
2. Compile and run the code.
3. Observe the unexpected output.
4. Compare with the corrected code in `bugSolution.kt`.