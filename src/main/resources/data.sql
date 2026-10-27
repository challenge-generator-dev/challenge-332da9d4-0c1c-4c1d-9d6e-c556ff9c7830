INSERT INTO accounts (id, account_number, customer_name, balance, status, created_at, updated_at) VALUES
('a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 'ACC-001', 'Juan Pérez García', 15000.00, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', 'ACC-002', 'María López Martínez', 25000.50, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('c0eebc99-9c0b-4ef8-bb6d-6bb9bd380a33', 'ACC-003', 'Carlos Rodríguez Sánchez', 5000.00, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('d0eebc99-9c0b-4ef8-bb6d-6bb9bd380a44', 'ACC-004', 'Ana Martínez Torres', 7500.25, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('e0eebc99-9c0b-4ef8-bb6d-6bb9bd380a55', 'ACC-005', 'Luis González Rivera', 0.00, 'INACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO transactions (id, type, amount, timestamp, description, account_id, created_at) VALUES
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a01', 'DEPOSIT', 5000.00, '2024-01-15 10:30:00', 'Depósito inicial cuenta ACC-001', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a02', 'WITHDRAWAL', 1500.00, '2024-01-16 14:20:00', 'Retiro cajero automático', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a03', 'TRANSFER', 2000.00, '2024-01-17 09:15:00', 'Transferencia a ACC-002', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a04', 'DEPOSIT', 10000.00, '2024-01-10 08:00:00', 'Depósito inicial cuenta ACC-002', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a05', 'DEPOSIT', 5000.00, '2024-01-12 11:30:00', 'Depósito nómina enero', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a06', 'WITHDRAWAL', 3000.00, '2024-01-18 16:45:00', 'Pago servicios', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a07', 'TRANSFER', 1000.00, '2024-01-19 10:00:00', 'Transferencia a ACC-003', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a08', 'DEPOSIT', 5000.00, '2024-01-08 09:00:00', 'Depósito inicial cuenta ACC-003', 'c0eebc99-9c0b-4ef8-bb6d-6bb9bd380a33', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a09', 'DEPOSIT', 7500.00, '2024-01-11 14:00:00', 'Depósito inicial cuenta ACC-004', 'd0eebc99-9c0b-4ef8-bb6d-6bb9bd380a44', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a10', 'WITHDRAWAL', 250.00, '2024-01-20 12:00:00', 'Cargo por mantenimiento', 'd0eebc99-9c0b-4ef8-bb6d-6bb9bd380a44', CURRENT_TIMESTAMP);