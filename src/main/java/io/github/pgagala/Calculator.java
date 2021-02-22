package io.github.pgagala;

class Calculator {

    /**
     * Divide two numbers.
     *
     * @return {@link Result} consists of quotient and reminder part of division
     * <p>
     * For example:
     * divide(2,1) will return Result(2,0)
     * divide(3,2) will return Result(1,1)
     */
    Result divide(int dividend, int divider) {
        if (divider == 0) {
            throw new IllegalArgumentException("Divider cannot be 0");
        }
        int quotient = dividend / divider;
        int reminder = dividend % divider;

        return new Result(quotient, reminder);
    }

}