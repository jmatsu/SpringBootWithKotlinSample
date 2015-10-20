package sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@EnableAutoConfiguration
public class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>): Unit {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}
