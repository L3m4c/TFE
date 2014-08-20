package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import service.*;

import javax.sql.DataSource;

/**
 * Created by Sl0th on 27/06/2014.
 */
@Configuration
@ImportResource({"classpath:/spring/spring-security.xml"})
@ComponentScan({"controller", "filter"})
@EnableAutoConfiguration(exclude = HibernateJpaVendorAdapter.class)
@EnableJpaRepositories("entity")
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        builder.setScriptEncoding("UTF-8");
        builder.addScript("classpath:/init.sql");
        return builder.setType(EmbeddedDatabaseType.H2).build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
        lef.setDataSource(dataSource());
        lef.setJpaVendorAdapter(jpaVendorAdapter());
        lef.setPackagesToScan("entity");
        return lef;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(true);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setDatabase(Database.H2);
        return hibernateJpaVendorAdapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new JpaTransactionManager();
    }

    @Bean
    public UserService getUserService() {
        return new UserService();
    }

    @Bean
    public MealService getMealService() {
        return new MealService();
    }
    @Bean
    public BoarderService getBoarderService() {
        return new BoarderService();
    }
    @Bean
    public SwaddleService getSwaddleService() {
        return new SwaddleService();
    }
    @Bean
    public AerosolService getAerosolService() {
        return new AerosolService();
    }
    @Bean
    public PatchService getPatchService() {
        return new PatchService();
    }
    @Bean
    public InjectionService getInjectionService() {
        return new InjectionService();
    }
    @Bean
    public ObservationService getObservationService() {
        return new ObservationService();
    }
    @Bean
    public InsulinTakingService getInsulinTakingService() {
        return new InsulinTakingService();
    }
    @Bean
    public InsulinDosageService getInsulinDosageService() {
        return new InsulinDosageService();
    }
    @Bean
    public WoundService getWoundService() {
        return new WoundService();
    }
    @Bean
    public DrugTreatmentService getDrugTreatmentService() {
        return new DrugTreatmentService();
    }
    @Bean
    public TherapeuticService getTherapeuticService() {
        return new TherapeuticService();
    }
    @Bean
    public HygieneService getHygieneService() {
        return new HygieneService();
    }
    @Bean
    public ClothingService getClothingService() {
        return new ClothingService();
    }
    @Bean
    public MobilizationService getMobilizationService() {
        return new MobilizationService();
    }
    @Bean
    public ToiletHelpingService getToiletHelpingService() {
        return new ToiletHelpingService();
    }
    @Bean
    public IncontinenceService getIncontinenceService() {
        return new IncontinenceService();
    }
    @Bean
    public EatService getEatService() {
        return new EatService();
    }
    @Bean
    public ParameterService getParameterService() {
        return new ParameterService();
    }
    @Bean
    public DisorderService getDisorderService() {
        return new DisorderService();
    }
    @Bean
    public AspectService getAspectService() {
        return new AspectService();
    }
    @Bean
    public MeasureService getMeasureService() {
        return new MeasureService();
    }
    @Bean
    public EmbankmentService getEmbankmentService() {
        return new EmbankmentService();
    }
    @Bean
    public SurroundingSkinService getSurroundingSkinService() {
        return new SurroundingSkinService();
    }
    @Bean
    public TreatmentService getTreatmentService() {
        return new TreatmentService();
    }
    @Bean
    public BandageService getBandageService() {
        return new BandageService();
    }
    @Bean
    public DrugService getDrugService() {
        return new DrugService();
    }
    @Bean
    public RolePermissionService getRolePermissionService() {
        return new RolePermissionService();
    }
}
