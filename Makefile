.PHONY: test build clean shell run

test:
	docker compose run --rm mower mvn test

shell:
	docker compose run --rm -it mower /bin/bash

