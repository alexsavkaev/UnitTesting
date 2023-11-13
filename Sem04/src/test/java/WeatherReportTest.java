import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
public class WeatherReportTest {
    @Test
    void ReportTest(){
        WeatherService serviceMock = mock(WeatherService.class);
        when(serviceMock.getCurrentTemperature()).thenReturn(Integer.valueOf("20"));
        WeatherReporter reporter = new WeatherReporter(serviceMock);
        String result = reporter.generateReport();
        assertThat(result).isEqualTo("Текущая температура: 20 градусов.");
    }
}
