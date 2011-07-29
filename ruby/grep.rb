File::open("test") do |f|
  f.each do |line|
    puts line if /text/ =~ line
  end
end
