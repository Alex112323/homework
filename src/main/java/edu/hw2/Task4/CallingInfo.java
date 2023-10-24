package edu.hw2.Task4;

public record CallingInfo(String className, String methodName) {
    public static CallingInfo callingInfo() {
        Throwable exception = new Throwable();
        StackTraceElement info = exception.getStackTrace()[1];
        return new CallingInfo(info.getClassName(), info.getMethodName());
    }
}
