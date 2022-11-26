create database proximity-db;

CREATE TABLE `tbl_plots` (
                               `plot_id` bigint(20) NOT NULL,
                               `longitude` tinyint(1) DEFAULT NULL,
                               `latitude` varchar(255) NOT NULL,
                               `area` datetime NOT NULL,
                               `unit` varchar(255) DEFAULT NULL,
                               `soil_type` varchar(255) DEFAULT NULL,
                               `moisturizer_availability` varchar(255) DEFAULT NULL,
                               `soil_toxicity` varchar(255) DEFAULT NULL,
                               `soil_toxicity` varchar(255) DEFAULT NULL,
                               `creation_date` datetime NOT NULL,
                               `last_modified` datetime DEFAULT NULL,
                               PRIMARY KEY (`plot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tbl_plot_irrigation` (
                                       `id` bigint(20) NOT NULL,
                                       `plot_id` bigint(20) NOT NULL,
                                       `water_amount` bigint(20) NOT NULL,
                                       `start_time` datetime NOT NULL,
                                       `end_time` datetime NOT NULL,
                                       `status` tinyint(1) NOT NULL,
                                       PRIMARY KEY (`id`),
                                       CONSTRAINT `FKhj2d95dhvdclem931hpnhak4e` FOREIGN KEY (`plot_id`) REFERENCES `tbl_plots` (`plot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `tbl_plot_sensor_mapping` (
                                       `id` bigint(20) NOT NULL,
                                       `plot_id` bigint(20) NOT NULL,
                                       `water_amount` bigint(20) NOT NULL,
                                       `start_time` datetime NOT NULL,
                                       `end_time` datetime NOT NULL,
                                       `status` tinyint(1) NOT NULL,
                                       PRIMARY KEY (`id`),
                                       CONSTRAINT `FKhj2d95dhvdclem931hpnhak4e` FOREIGN KEY (`plot_id`) REFERENCES `tbl_plots` (`plot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;





























