package io.mosip.kernel.auth.dto.otp;

/**
 *  @author Sabbu Uday Kumar
 *  @since 1.0.0
 */
public class OtpGenerateResponseDto {
    private String otp;
    private String status;

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
