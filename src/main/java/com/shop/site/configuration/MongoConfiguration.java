package com.shop.site.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteConcern;

@Configuration
@EnableMongoRepositories
@ComponentScan("com.shop.site")
@PropertySource("classpath:application.properties")
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "shop";
	}

	@Override
	public Mongo mongo() throws Exception {
		//String host = System.getenv("OPENSHIFT_MONGODB_DB_HOST");
		//String portString = System.getenv("OPENSHIFT_MONGODB_DB_PORT");
		//int port = Integer.getInteger(portString);
		// ServerAddress serverAddress = new ServerAddress(host, port);
		// UserCredentials credentials = new
		// UserCredentials("admin","3KIU2WVJG8lI");
		return new MongoClient(new MongoClientURI(System.getenv("OPENSHIFT_MONGODB_DB_URL")));
	}

	@Override
	public String getMappingBasePackage() {	
		return "com.shop.site.model";
	}
	
	@Override
	@Bean
	public MongoTemplate mongoTemplate() throws Exception{
		final UserCredentials userCredentials = new UserCredentials(System.getenv("OPENSHIFT_MONGODB_DB_USERNAME"), System.getenv("OPENSHIFT_MONGODB_DB_PASSWORD"));
		final MongoTemplate mongoTemplate = new MongoTemplate(mongo(), getDatabaseName(), userCredentials);
		mongoTemplate.setWriteConcern(WriteConcern.SAFE);
		return mongoTemplate;
	}

}
