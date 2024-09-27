create table if not exists kernel_ridge_model_job(
kernel_device_id Integer not null,
kernel_device_name varchar(255) null,
kernel_device_registry varchar(255) null,
kernel_device_start_time varchar(255) null,
kernel_device_approved_time varchar(255) null,
kernel_device_owner varchar(255) null,
authorized_device char null,
time_out_in_seconds varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint kernel_ridge_model_job_pk primary key(kernel_device_id));