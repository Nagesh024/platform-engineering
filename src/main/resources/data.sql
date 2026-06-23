INSERT INTO portal_modules(module_name,description,status)
VALUES
('Dashboard','Platform Overview','ACTIVE'),

('Service Catalog','Service Registry','ACTIVE'),

('Deployments','Deployment Management','ACTIVE'),

('Environments','Environment Management','ACTIVE'),

('Monitoring','Prometheus Grafana Integration','ACTIVE'),

('Documentation','Developer Documentation','ACTIVE');
INSERT INTO security_controls
(control_name, category, description, mandatory, compliance_level)
VALUES
('OAuth2 Authentication',
 'AUTHENTICATION',
 'OAuth2 with JWT tokens',
 true,
 'CRITICAL');

INSERT INTO security_controls
(control_name, category, description, mandatory, compliance_level)
VALUES
('Vault Secrets Management',
 'SECRETS',
 'Secrets stored in Vault',
 true,
 'CRITICAL');