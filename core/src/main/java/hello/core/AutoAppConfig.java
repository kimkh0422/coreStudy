package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
        Configuration.class)
)
public class AutoAppConfig {

//   @Bean(name = "memoryMemberRepository")
//  public MemberRepository memberRepository(){
//       return new MemoryMemberRepository();
// }
}
