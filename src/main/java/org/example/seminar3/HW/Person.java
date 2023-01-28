   return family + " " + name + " " + middle_name + " " + birthday + " id: " + id;
    }


    @Override
    public void save(DataOutputStream stream_out) throws IOException {
        stream_out.writeInt(id);
