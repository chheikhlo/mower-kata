.PHONY: test build clean shell run

test:
	docker compose run --rm mower mvn test

simulation:
	docker compose run --rm mower mvn -Dtest=MowerSimulationTest test

shell:
	docker compose run --rm -it mower /bin/bash

