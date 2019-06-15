
package com.github.hcsp.objectbasic;
org.junit.jupiter.api.Test;;org.hamcrest.Matchers;;com.github.blindpirate.extensions.CaptureSystemOutput;

class MainTest {
@Test
    @CaptureSystemOutput
    public void test(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.matchesRegex("(?s).*1\\s+2\\s+3\\s+4\\s+5\\s+6\\s+7.*"));
        Main.main(null);
    }

}
