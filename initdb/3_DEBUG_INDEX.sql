SELECT setval(pg_get_serial_sequence('experience', 'id'), coalesce(max(id)+1, 1), false) FROM experience;
SELECT setval(pg_get_serial_sequence('formation', 'id'), coalesce(max(id)+1, 1), false) FROM formation;
SELECT setval(pg_get_serial_sequence('recommandation', 'id'), coalesce(max(id)+1, 1), false) FROM recommandation;
SELECT setval(pg_get_serial_sequence('hobby', 'id'), coalesce(max(id)+1, 1), false) FROM hobby;
SELECT setval(pg_get_serial_sequence('message', 'id'), coalesce(max(id)+1, 1), false) FROM message;
SELECT setval(pg_get_serial_sequence('profil', 'id'), coalesce(max(id)+1, 1), false) FROM profil;
SELECT setval(pg_get_serial_sequence('skill', 'id'), coalesce(max(id)+1, 1), false) FROM skill;
SELECT setval(pg_get_serial_sequence('socialnetwork', 'id'), coalesce(max(id)+1, 1), false) FROM socialnetwork;