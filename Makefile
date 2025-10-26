


.PHONY: doc_observability_infrastructure_up
doc_observability_infrastructure_up:
	cd code && \
  	docker compose -f tools/obs-infrastructure/docker-compose.yaml up

.PHONY: doc_observability_infrastructure_down
doc_observability_infrastructure_down:
	cd code && \
	docker compose -f tools/obs-infrastructure/docker-compose.yaml down